package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiFileDownload: ImageVector
    get() {
        if (_SiFileDownload != null) {
            return _SiFileDownload!!
        }
        _SiFileDownload = ImageVector.Builder(
            name = "Filled.SiFileDownload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(9.586f)
                lineToRelative(2.293f, -2.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, 1.414f)
                lineToRelative(-4f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, 0f)
                lineToRelative(-4f, -4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.414f, -1.414f)
                lineTo(11f, 13.586f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(0.6f)
                curveTo(4f, 19.482f, 5.518f, 21f, 7.4f, 21f)
                horizontalLineToRelative(9.2f)
                curveToRelative(1.882f, 0f, 3.4f, -1.518f, 3.4f, -3.4f)
                verticalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(0.6f)
                curveToRelative(0f, 0.778f, -0.622f, 1.4f, -1.4f, 1.4f)
                horizontalLineTo(7.4f)
                curveToRelative(-0.778f, 0f, -1.4f, -0.622f, -1.4f, -1.4f)
                close()
            }
        }.build()

        return _SiFileDownload!!
    }

@Suppress("ObjectPropertyName")
private var _SiFileDownload: ImageVector? = null
