import com.github.busaeed.einvoice.qrbarcode.QRBarcodeEncoder;
import com.github.busaeed.einvoice.qrbarcode.tag.InvoiceDate;
import com.github.busaeed.einvoice.qrbarcode.tag.InvoiceTaxAmount;
import com.github.busaeed.einvoice.qrbarcode.tag.InvoiceTotalAmount;
import com.github.busaeed.einvoice.qrbarcode.tag.Seller;
import com.github.busaeed.einvoice.qrbarcode.tag.TaxNumber;

public class Test {
	
	public static void main(String[] args) {
		String qrBarcodeHash = QRBarcodeEncoder.encode(
			new Seller("شركة تجريبية"),
			new TaxNumber("312345678901233"),
			new InvoiceDate("2021-11-18T18:40:34+03:00"),
			new InvoiceTotalAmount("2.30"),
			new InvoiceTaxAmount("0.30")
		);
		System.out.println(qrBarcodeHash);
	}
	
}