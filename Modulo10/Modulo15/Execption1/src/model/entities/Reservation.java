package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	
	private Integer numeroQuarto;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer numeroQuarto, Date checkIn, Date checkOut) throws DomainException {
		if(!checkOut.after(checkIn)){
			throw new DomainException( "Erro na reserva: Check-out data deve ser feita depois da data de check-in");
		}
		this.numeroQuarto = numeroQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getCheckIn() {
		return checkIn;
	}


	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duracao() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public void datasAtualizadas(Date checkIn, Date checkOut) throws DomainException {
		Date agora = new Date();
		if(checkIn.before(agora) || checkOut.before(agora)) {
			throw new DomainException( "Erro na reserva: As datas resevadas devem ser atualizadas para data futuras");
		}
		if(!checkOut.after(checkIn)){
			throw new DomainException( "Erro na reserva: Check-out data deve ser feita depois da data de check-in");
		}
		this.checkIn=checkIn;
		this.checkOut=checkOut;
		
	}

	@Override
	public String toString() {
		return "Quarto"
				+numeroQuarto
				+", check-in:: "
				+sdf.format(checkIn)
				+", check-out: "
				+sdf.format(checkOut)
				+", "
				+duracao()
				+" Noites";
	}
	
	
	
	
	

}
