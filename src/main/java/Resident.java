import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Resident {
    public int id;
    public String firstName;
    public String lastName;
    public String houseNumber;
    public String contactNumber;
    public String emailId;

}
