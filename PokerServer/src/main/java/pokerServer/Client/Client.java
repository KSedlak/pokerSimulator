package pokerServer.Client;

import java.util.List;

import org.springframework.web.socket.WebSocketSession;

import pokerServer.Deck.Card.Card;

public class Client {
	
	private String name;
	private WebSocketSession session;
	private Boolean readyForPlay;
	private Card[] hand;	
	
	
	public Client(WebSocketSession session) {
		super();
		this.session = session;
		readyForPlay=false;
		hand=new Card[2];
	}
	
	
	public Client(String name, WebSocketSession session) {
		super();
		this.name = name;
		this.session = session;
		readyForPlay=false;
	}
	
	


	public Card[] getHand() {
		return hand;
	}


	public void setHand(Card[] hand) {
		this.hand = hand;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WebSocketSession getSession() {
		return session;
	}
	public void setSession(WebSocketSession session) {
		this.session = session;
	}
	public Boolean getReadyForPlay() {
		return readyForPlay;
	}
	public void setReadyForPlay(Boolean readyForPlay) {
		this.readyForPlay = readyForPlay;
	}
	
	public void introduceAndReadyForPlay(String name){
		this.name=name;
		readyForPlay=true;
	}
	
	

}
