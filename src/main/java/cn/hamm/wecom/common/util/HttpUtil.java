package cn.hamm.wecom.common.util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Objects;

/**
 * <h1>HTTP</h1>
 *
 * @author Hamm.cn
 */
public class HttpUtil {
    /**
     * <h2>发起Post请求</h2>
     *
     * @param url  URL
     * @param json Json
     * @return Response
     */
    public static String post(String url, String json) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost httpPost = new HttpPost(url);
            StringEntity entity = new StringEntity(json);
            entity.setContentType(ContentType.APPLICATION_JSON.getMimeType());
            httpPost.setEntity(entity);
            return request(httpClient.execute(httpPost));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * <h2>发起Get请求</h2>
     *
     * @param url URL
     * @return Response
     */
    public static String get(String url) {
        System.out.println(url);
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(url);
            return request(httpClient.execute(httpGet));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * <h2>请求</h2>
     *
     * @param execute CloseableHttpResponse
     * @return Response
     */
    private static String request(CloseableHttpResponse execute) {
        try (CloseableHttpResponse httpResponse = execute) {
            if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                HttpEntity response = httpResponse.getEntity();
                if (Objects.nonNull(response)) {
                    return EntityUtils.toString(response);
                }
                throw new RuntimeException("服务器未返回数据");
            }
            throw new RuntimeException("服务器返回异常");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
