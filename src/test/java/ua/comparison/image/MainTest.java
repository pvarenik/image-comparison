package ua.comparison.image;

import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

import static ua.comparison.image.ImageComparisonTools.createGUI;

public class MainTest {

    /**
     * Test main case.
     */
    @Test
    public void testClassicalCase() throws IOException, URISyntaxException {
        ImageComparison comparison = new ImageComparison("image1.png", "image2.png");
        createGUI( comparison.compareImages() );
    }

    /**
     * Test issue #17. It was StackOverFlowError.
     */
    @Test
    public void testIssue17() throws IOException, URISyntaxException {
        new ImageComparison( "b1#17.png", "b2#17.png" ).compareImages();
    }
}
