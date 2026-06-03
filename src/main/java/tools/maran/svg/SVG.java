package tools.maran.svg;

/// Contract for SVG path providers.
///
/// @author Marius Hanl
public interface SVG {

    /// Returns the SVG path, (e.g. `"M10 20v-6h4v6h5v-8h3L12 3 2 12h3v8z"`).
    ///
    /// @return the SVG path
    String path();

}
