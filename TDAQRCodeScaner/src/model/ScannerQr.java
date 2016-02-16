package model;

import java.util.Date;

public class ScannerQr {

	private String qr_code;
	private long id;
	private Date data_leitura;
	private long imei_cel;
	
	public ScannerQr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ScannerQr(String qr_code, long id, Date data_leitura, long imei_cel) {
		super();
		this.qr_code = qr_code;
		this.id = id;
		this.data_leitura = data_leitura;
		this.imei_cel = imei_cel;
	}

	public ScannerQr(String qr_code, Date data_leitura, long imei_cel) {
		super();
		this.qr_code = qr_code;
		this.data_leitura = data_leitura;
		this.imei_cel = imei_cel;
	}

	public String getQr_code() {
		return qr_code;
	}

	public void setQr_code(String qr_code) {
		this.qr_code = qr_code;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getData_leitura() {
		return data_leitura;
	}

	public void setData_leitura(Date data_leitura) {
		this.data_leitura = data_leitura;
	}

	public long getImei_cel() {
		return imei_cel;
	}

	public void setImei_cel(long imei_cel) {
		this.imei_cel = imei_cel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScannerQr other = (ScannerQr) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ScannerQr [ qr_code = " + qr_code + ", id = " + id + ", data_leitura = "
				+ data_leitura + ", imei_cel = " + imei_cel + " ]";
	}
}