package test.app.plugin;

import ro.fortsoft.pf4j.Plugin;
import ro.fortsoft.pf4j.PluginWrapper;

public class TestPlugin extends Plugin {

    public TestPlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void start() {
        System.out.println("TestPlugin.start()");
    }

    @Override
    public void stop() {
        System.out.println("TestPlugin.stop()");
    }
}
