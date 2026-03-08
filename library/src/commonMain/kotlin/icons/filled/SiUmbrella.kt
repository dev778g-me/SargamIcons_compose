package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiUmbrella: ImageVector
    get() {
        if (_SiUmbrella != null) {
            return _SiUmbrella!!
        }
        _SiUmbrella = ImageVector.Builder(
            name = "Filled.SiUmbrella",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.186f, 18.39f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.03f, 0.97f)
                curveToRelative(0.062f, 1.968f, -1.529f, 3.579f, -3.49f, 3.638f)
                lineToRelative(-0.03f, 0.001f)
                horizontalLineToRelative(-0.088f)
                curveToRelative(-1.954f, 0.044f, -3.549f, -1.54f, -3.608f, -3.491f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                curveTo(1f, 5.925f, 5.925f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.925f, 11f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(6.447f)
                lineToRelative(0.013f, 0.167f)
                curveToRelative(0.106f, 0.821f, 0.801f, 1.409f, 1.564f, 1.385f)
                horizontalLineToRelative(0.088f)
                curveToRelative(0.907f, -0.027f, 1.578f, -0.763f, 1.553f, -1.577f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.968f, -1.031f)
            }
        }.build()

        return _SiUmbrella!!
    }

@Suppress("ObjectPropertyName")
private var _SiUmbrella: ImageVector? = null
