package DesignPattern;

public class NotificationFactory {
    public Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        if(channel.equalsIgnoreCase("SMS")) {  
            return new SMSNotification();  
          }   
      else if(channel.equalsIgnoreCase("EMAIL")){  
           return new EmailNotification();  
       }   
     else if(channel.equalsIgnoreCase("PUSH")) {  
           return new PushNotification();  
     }  
 return null;  
        
    }
}