import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Owner {
    public int id;
    public String firstName;
    public String lastName;
    public String contactNumber;
    public String emailId;
    public String[] houseNumbersOwned;
}
