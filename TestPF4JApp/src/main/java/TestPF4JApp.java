import ro.fortsoft.pf4j.DefaultPluginManager;
import ro.fortsoft.pf4j.PluginManager;
import test.app.api.TestInterface;

import java.util.List;

public class TestPF4JApp {
    public static void main(String[] arg) {
        PluginManager pluginManager = new DefaultPluginManager();
        pluginManager.loadPlugins();
        pluginManager.startPlugins();


        List<TestInterface> plugins = pluginManager.getExtensions(TestInterface.class);
        for (TestInterface plugin : plugins) {
            plugin.run();
        }
    }
}
