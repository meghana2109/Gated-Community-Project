import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ElectricityBill {
    public String billID;
    public double billAmount;
    public Date dueDate;
    public String status;
}
