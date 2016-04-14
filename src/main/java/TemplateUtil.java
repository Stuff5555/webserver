import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by tmp on 14.04.2016.
 */
public class TemplateUtil {
    static {
        Properties properties = new Properties();
        properties.setProperty(RuntimeConstants.RESOURCE_LOADER, "class");
        properties.setProperty("class.resourcelader.class", ClasspathResourceLoader.class.getName());
        Velocity.init(properties);
    }
    public static void main(String[] args) throws IOException {
        Map<String, Object> map = new HashMap <>();
        map.put("name", "");
        Writer writer = new PrintWriter(System.out, true);
        Velocity.mergeTemplate("post.vsl", "UTF-8", new VelocityContext(), null);
        writer.flush();
    }
}