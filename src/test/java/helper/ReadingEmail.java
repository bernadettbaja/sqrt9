package Helper;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Store;

public class ReadingEmail {
	
	
//	public static void main(String[] args) {
//		Properties props = new Properties();
//		props.setProperty("mail.store.protocol", "imaps");
//
//		try {
//			Session session = Session.getInstance(props, null);
//			Store store = session.getStore();
//			store.connect("imap.gmail.com", "vioricaAVlaic@gmail.com", "Viking27");
//			Folder inbox = store.getFolder("INBOX");
//			inbox.open(Folder.READ_ONLY);
//			Message msg = inbox.getMessage(inbox.getMessageCount());
//			Address[] in = msg.getFrom();
//			for (Address address : in) {
//				System.out.println("FROM:" + address.toString());
//			}
//			Multipart mp = (Multipart) msg.getContent();
//			BodyPart bp = mp.getBodyPart(0);
//			System.out.println("SENT DATE:" + msg.getSentDate());
//			System.out.println("SUBJECT:" + msg.getSubject());
//			System.out.println("CONTENT:" + bp.getContent());
//		} catch (Exception mex) {
//			mex.printStackTrace();
//		}
//	}
}
