package college;

import java.util.*;

public class SocialMedia {
    private Map<String, HashSet<String>> followersMap;
    private Map<String, List<String>> inbox;


    public SocialMedia() {
        this.followersMap = new HashMap<>();
        this.inbox = new HashMap<>();
    }


    public void registerUser(String username){
        if(followersMap.containsKey(username)) {
            System.out.println("Username already exists! Try another one. ");
        } else{
            followersMap.put(username, new HashSet<>());
            inbox.put(username, new ArrayList<>());
            System.out.println(username + " has been registered successfully!");
        }
    }


    public void followUser(String follower, String following){
        if(!followersMap.containsKey(follower) || !followersMap.containsKey(following)) {
            System.out.println("one of both users do not exist.");
            return;
        }
        if(follower.equals(following)) {
            System.out.println("You cannot follow yourself!");
            return;
        }

        HashSet<String> followers = followersMap.get(following);
        if(followers.add(follower)) {
            System.out.println(follower + "is now following "  + following);
        } else{
            System.out.println(follower + "is already following " + following);
        }
    }


    public void unfollowUser(String follower, String following){
        if(!followersMap.containsKey(follower)  || !followersMap.containsKey(following)) {
            System.out.println("One or both users do not exist.");
            return;
        }

        HashSet<String> followers = followersMap.get(following);
        if(followers.remove(follower)) {
            System.out.println(follower + "has unfollowed " + following);
        } else{
            System.out.println(follower + "is not following " + following);
        }
    }


    public void sendMessage(String sender, String receiver, String message) {
        if(!followersMap.containsKey(sender) || !followersMap.containsKey(receiver)){
            System.out.println("One or both users do not exist.");
            return;
        }

        if(!followersMap.get(receiver).contains(sender)) {
            System.out.println("Message failed! "+ receiver + "must folloe you to recive messages.");
            return;
        }

        inbox.get(receiver).add("From "+ sender + ": " + message);
        System.out.println("Message sent to "+ receiver);
    }

    public void viewInbox(String username){
        if(!inbox.containsKey(username)) {
            System.out.println("User does not exist. ");
            return;
        }

        List<String> messages = inbox.get(username);
        if(messages.isEmpty()) {
            System.out.println(username + "'s inbox is empty.");
        } else{
            System.out.println(username + "'s inbox:");
            for(String msg : messages) {
                System.out.println(msg);
            }
        }
    }

    public void displayFollowers(String username) {
        if(!followersMap.containsKey(username)) {
            System.out.println("User does not exist.");
            return;
        }

        HashSet<String> followers = followersMap.get(username);
        if(followersMap.isEmpty()) {
            System.out.println(username + "has mo followers.");
        } else{
            System.out.println(username + "'s followers:" + followers);
        }
    }

    public void dispalyFollowing(String username){
        if(!followersMap.containsKey(username)){
            System.out.println("User does not exist.");
            return;
        }

        HashSet<String> following = new HashSet<>();
        for(Map.Entry<String, HashSet<String>> entry : followersMap.entrySet()) {
            if(entry.getValue().contains(username)) {
                following.add(entry.getKey());
            }
        }

        if(following.isEmpty()) {
            System.out.println(username + "is not following anyone.");
        } else {
            System.out.println(username + "is following:" + following);
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        SocialMedia sm = new SocialMedia();

        while (true) {
            System.out.println("\n==== Social media Platform ====");
            System.out.println("1. Register User");
            System.out.println("2. follow a User");
            System.out.println("3. Unfollow a User");
            System.out.println("4. Show User's Followers");
            System.out.println("5. Show User's followed by a User");
            System.out.println("6. Send Message");
            System.out.println("7. View Inbox");
            System.out.println("8. Exit");
            System.out.println("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("Enter username to register: ");
                    String newUser = sc.nextLine();
                    sm.registerUser(newUser);
                    break;

                case 2:
                    System.out.println("Enter your username: ");
                    String follower = sc.nextLine();
                    System.out.println("Enter username to follow: ");
                    String following = sc.nextLine();
                    sm.followUser(follower, following);
                    break;

                case 3:
                    System.out.println("Enter your username: ");
                    String unfollower = sc.nextLine();
                    System.out.println("Enter username to unfollow: ");
                    String unfollowing = sc.nextLine();
                    sm.unfollowUser(unfollower, unfollowing);
                    break;

                case 4:
                    System.out.println("Enter username to see followers: ");
                    String userToCheckFollowers = sc.nextLine();
                    sm.displayFollowers(userToCheckFollowers);
                    break;

                case 5:
                    System.out.println("Enter username to see who they are following: ");
                    String userToCheckFollowing = sc.nextLine();
                    sm.dispalyFollowing(userToCheckFollowing);
                    break;

                case 6:
                    System.out.println("Enter your username: ");
                    String sender = sc.nextLine();
                    System.out.println("Enter receiver's username: ");
                    String receiver = sc.nextLine();
                    System.out.println("Enter message: ");
                    String message = sc.nextLine();
                    sm.sendMessage(sender, receiver, message);
                    break;

                case 7:
                    System.out.println("Enter username to view inbox: ");
                    String userToCheckInbox = sc.nextLine();
                    sm.viewInbox(userToCheckInbox);
                    break;

                case 8:
                    System.out.println("Exiting... Thank you for using the platform!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                System.out.println("Invalid choice! Please try again.");
            }
        }
    }
    
}
