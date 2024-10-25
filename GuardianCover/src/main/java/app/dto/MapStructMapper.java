package app.dto;

import app.dto.records.*;
import app.entity.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(
        componentModel = "spring"
)
public interface MapStructMapper {
    MapStructMapper INSTANCE = Mappers.getMapper(MapStructMapper.class);
    UserDTO userToUserDTO(User user);
    User toUser(UserDTO userDTO);
    InsuranceDTO insuranceToInsuranceDTO(Insurance insurance);
    Insurance toInsurance(InsuranceDTO insuranceDTO);
    HouseInsuranceDTO housetoHouseInsuranceDTO(HouseInsurance houseInsurance);
    HouseInsurance toHouseInsurance(HouseInsuranceDTO houseInsuranceDTO);
    HealthInsuranceDTO healthToHealthInsuranceDTO(HealthInsurance healthInsurance);
    HealthInsurance toHealthInsurance(HealthInsuranceDTO healthInsuranceDTO);
    CarInsuranceDTO carToCarInsuranceDTO(CarInsurance carInsurance);
    CarInsurance toCarInsurance(CarInsuranceDTO carInsuranceDTO);
    ContractDTO contractToContractDTO(Contract contract);
    Contract toContract(ContractDTO contractDTO);

}
