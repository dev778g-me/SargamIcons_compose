package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiUnderline: ImageVector
    get() {
        if (_SiUnderline != null) {
            return _SiUnderline!!
        }
        _SiUnderline = ImageVector.Builder(
            name = "Filled.SiUnderline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                close()
                moveTo(5f, 12f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(7f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.748f, 2.252f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.252f, 5f, -5f)
                verticalLineTo(4f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 3.852f, -3.148f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.148f, -7f, -7f)
            }
        }.build()

        return _SiUnderline!!
    }

@Suppress("ObjectPropertyName")
private var _SiUnderline: ImageVector? = null
