package tools.maran.svg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/// Smoke contract tests for {@link SVG}.
///
/// @author Marius Hanl
class SVGTest {

    @Test
    @DisplayName("Simple contract test.")
    void testSVGContract() {
        String path = "M10 20v-6h4v6h5v-8h3L12 3 2 12h3v8z";
        SVG svg = () -> path;
        assertEquals(path, svg.path());
    }

}
