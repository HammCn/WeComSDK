package cn.hamm.wecom.common.util.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

/**
 * <h1>布尔数字反序列化</h1>
 *
 * @author Hamm.cn
 */
public class ZeroOneToBoolean extends JsonDeserializer<Boolean> {

    @Override
    public Boolean deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        return p.getValueAsInt() != 0;
    }
}
