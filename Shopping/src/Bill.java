import java.util.Date;
public class Bill {
	private int Billno;
	private Date Billdate;
	private double Total;
	private double cgst;
	private double sgst;
	private double FinalTotal;
	public Bill(int billno, Date billdate, double total, double cgst, double sgst, double finalTotal) {
		super();
		Billno = billno;
		Billdate = billdate;
		Total = total;
		this.cgst = cgst;
		this.sgst = sgst;
		FinalTotal = finalTotal;
	}
	public int getBillno() {
		return Billno;
	}
	public void setBillno(int billno) {
		Billno = billno;
	}
	public Date getBilldate() {
		return Billdate;
	}
	public void setBilldate(Date billdate) {
		Billdate = billdate;
	}
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	public double getCgst() {
		return cgst;
	}
	public void setCgst(double cgst) {
		this.cgst = cgst;
	}
	public double getSgst() {
		return sgst;
	}
	public void setSgst(double sgst) {
		this.sgst = sgst;
	}
	public double getFinalTotal() {
		return FinalTotal;
	}
	public void setFinalTotal(double finalTotal) {
		FinalTotal = finalTotal;
	}
}
