public class main {
    public static void main(String[] args) {
        MessagingService ms = new MessagingService();

        System.out.println(ms.getMessage());
        ms.add(new Message("Github", "hi"));
        System.out.println(ms.getMessages());
    }
}
