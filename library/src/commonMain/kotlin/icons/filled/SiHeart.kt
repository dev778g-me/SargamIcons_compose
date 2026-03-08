package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiHeart: ImageVector
    get() {
        if (_SiHeart != null) {
            return _SiHeart!!
        }
        _SiHeart = ImageVector.Builder(
            name = "Filled.SiHeart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.696f, 3f)
                curveTo(14.652f, 3f, 12.887f, 4.197f, 12f, 5.943f)
                curveTo(11.113f, 4.197f, 9.348f, 3f, 7.304f, 3f)
                curveTo(4.374f, 3f, 2f, 5.457f, 2f, 8.481f)
                reflectiveCurveToRelative(1.817f, 5.796f, 4.165f, 8.073f)
                reflectiveCurveTo(12f, 21f, 12f, 21f)
                reflectiveCurveToRelative(3.374f, -2.133f, 5.835f, -4.446f)
                curveTo(20.46f, 14.088f, 22f, 11.514f, 22f, 8.481f)
                reflectiveCurveTo(19.626f, 3f, 16.696f, 3f)
            }
        }.build()

        return _SiHeart!!
    }

@Suppress("ObjectPropertyName")
private var _SiHeart: ImageVector? = null
