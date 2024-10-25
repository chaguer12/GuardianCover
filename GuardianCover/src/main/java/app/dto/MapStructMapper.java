package app.dto;

import app.dto.records.*;
import app.entity.*;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface MapStructMapper {
    UserDTO userToUserDTO(User user);
    InsuranceDTO insuranceToInsuranceDTO(Insurance insurance);
    HouseInsuranceDTO housetoHouseInsuranceDTO(HouseInsurance houseInsurance);
    HealthInsurance healthToHealthInsuranceDTO(HealthInsurance healthInsurance);
    CarInsuranceDTO carToCarInsuranceDTO(CarInsurance carInsurance);
    ContractDTO contractToContractDTO(Contract contract);

}
