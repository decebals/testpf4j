package test.app.plugin;

import ro.fortsoft.pf4j.Extension;
import test.app.api.TestInterface;

@Extension
public class TestExtension implements TestInterface {
    public void run() {
        System.out.println("Test Extension run() called.");
    }
}
