package readBookAndBuy.readBookAndBuy.domain.entity;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class BooleanConverter implements AttributeConverter<Boolean, String> {

    /**
     * Boolean 값을 Y 또는 N으로 convert
     *
     * @param attribute boolean 값
     * @return String true 인 경우 Y 또는 false인 경우 N
     */
    @Override
    public String convertToDatabaseColumn(Boolean attribute) {
        return (attribute != null && attribute) ? "True" : "False";
    }

    /**
     * Y 또는 N 을 Boolean 으로 convert
     * @param yn
     * @return
     */
    @Override
    public Boolean convertToEntityAttribute(String yn) {
        return "True".equalsIgnoreCase(yn);
    }
}
