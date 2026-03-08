package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiFileUpload: ImageVector
    get() {
        if (_SiFileUpload != null) {
            return _SiFileUpload!!
        }
        _SiFileUpload = ImageVector.Builder(
            name = "Filled.SiFileUpload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.293f, 3.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, 0f)
                lineToRelative(4f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, 1.414f)
                lineTo(13f, 6.414f)
                verticalLineTo(16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                verticalLineTo(6.414f)
                lineTo(8.707f, 8.707f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, -1.414f)
                close()
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

        return _SiFileUpload!!
    }

@Suppress("ObjectPropertyName")
private var _SiFileUpload: ImageVector? = null
