package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiCopyAlt: ImageVector
    get() {
        if (_SiCopyAlt != null) {
            return _SiCopyAlt!!
        }
        _SiCopyAlt = ImageVector.Builder(
            name = "Filled.SiCopyAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.4f, 3f)
                horizontalLineToRelative(7.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 5.4f)
                verticalLineToRelative(7.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12.6f)
                verticalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.4f, 3f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 10f)
                horizontalLineToRelative(0.6f)
                curveToRelative(0.778f, 0f, 1.4f, 0.622f, 1.4f, 1.4f)
                verticalLineToRelative(7.2f)
                curveToRelative(0f, 0.778f, -0.622f, 1.4f, -1.4f, 1.4f)
                horizontalLineToRelative(-7.2f)
                curveToRelative(-0.778f, 0f, -1.4f, -0.622f, -1.4f, -1.4f)
                verticalLineTo(18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(0.6f)
                curveToRelative(0f, 1.882f, 1.518f, 3.4f, 3.4f, 3.4f)
                horizontalLineToRelative(7.2f)
                curveToRelative(1.882f, 0f, 3.4f, -1.518f, 3.4f, -3.4f)
                verticalLineToRelative(-7.2f)
                curveTo(22f, 9.518f, 20.482f, 8f, 18.6f, 8f)
                horizontalLineTo(18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
            }
        }.build()

        return _SiCopyAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiCopyAlt: ImageVector? = null
