package cn.hamm.wecom.common.util.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * <h1>布尔数字序列化</h1>
 *
 * @author Hamm.cn
 */
public class BooleanToZeroOne extends JsonSerializer<Boolean> {

    @Override
    public void serialize(Boolean value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeNumber(value ? 1 : 0);
    }
}
