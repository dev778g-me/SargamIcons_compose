package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiStarAlt: ImageVector
    get() {
        if (_SiStarAlt != null) {
            return _SiStarAlt!!
        }
        _SiStarAlt = ImageVector.Builder(
            name = "Filled.SiStarAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.025f, 2f)
                curveToRelative(-0.455f, 0f, -0.805f, 0.22f, -1.014f, 0.399f)
                curveToRelative(-0.22f, 0.189f, -0.395f, 0.424f, -0.512f, 0.659f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.05f, 0.119f)
                lineTo(8.662f, 8.313f)
                horizontalLineTo(2.681f)
                curveToRelative(-0.455f, 0f, -0.805f, 0.22f, -1.014f, 0.399f)
                arcToRelative(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.512f, 0.66f)
                curveToRelative(-0.209f, 0.416f, -0.18f, 0.858f, -0.07f, 1.189f)
                curveToRelative(0.1f, 0.297f, 0.305f, 0.627f, 0.65f, 0.842f)
                lineToRelative(4.614f, 3.714f)
                lineToRelative(-1.46f, 5.615f)
                curveToRelative(-0.148f, 0.38f, -0.115f, 0.769f, -0.016f, 1.067f)
                curveToRelative(0.11f, 0.33f, 0.353f, 0.7f, 0.77f, 0.91f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.652f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.134f, -0.081f)
                lineToRelative(4.715f, -3.368f)
                lineToRelative(4.548f, 3.328f)
                curveToRelative(0.404f, 0.355f, 0.847f, 0.353f, 0.999f, 0.352f)
                horizontalLineToRelative(0.032f)
                curveToRelative(0.146f, 0.001f, 0.561f, 0.003f, 0.952f, -0.313f)
                curveToRelative(0.331f, -0.215f, 0.53f, -0.537f, 0.628f, -0.828f)
                arcToRelative(1.58f, 1.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.026f, -1.093f)
                lineToRelative(-1.68f, -5.484f)
                lineToRelative(4.78f, -3.869f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.265f, -0.33f)
                lineToRelative(0.021f, -0.043f)
                curveToRelative(0.11f, -0.215f, 0.337f, -0.663f, 0.337f, -1.161f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.106f, -0.448f)
                arcToRelative(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.512f, -0.659f)
                curveToRelative(-0.209f, -0.18f, -0.559f, -0.399f, -1.013f, -0.399f)
                horizontalLineToRelative(-5.87f)
                lineToRelative(-1.905f, -5.155f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.043f, -0.1f)
                arcToRelative(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.512f, -0.66f)
                curveToRelative(-0.21f, -0.179f, -0.56f, -0.398f, -1.014f, -0.398f)
            }
        }.build()

        return _SiStarAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiStarAlt: ImageVector? = null
