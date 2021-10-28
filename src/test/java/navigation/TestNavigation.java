package navigation;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IndexPage;
import pages.ManualPage;

public class TestNavigation extends BaseTests {

    @Test
    public void testNavigateFromIndexPage() {
        IndexPage aboutMePage = indexPage.clickLinkAboutMe();
        Assert.assertEquals(aboutMePage.getHeadingText(),
                "Hi, I'm Ruth and I make software.",
                "Expected heading text was not found");
        ManualPage userManualPage = indexPage.clickLinkUserManual();
        Assert.assertEquals(userManualPage.getHeadingText(),
                "Manual of Me.",
                "Expected heading text was not found");

    }
}
