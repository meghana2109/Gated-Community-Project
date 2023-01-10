import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MaintenanceBill {
    public String billID;
    public String houseNumber;
    public double amount;
    public Date dueDate;
    public String status;

}
