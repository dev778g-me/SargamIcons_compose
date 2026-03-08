package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiSignOut: ImageVector
    get() {
        if (_SiSignOut != null) {
            return _SiSignOut!!
        }
        _SiSignOut = ImageVector.Builder(
            name = "Filled.SiSignOut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 5.4f)
                arcTo(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.4f, 4f)
                horizontalLineToRelative(6.2f)
                arcTo(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 5.4f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                verticalLineTo(5.4f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.6f, 2f)
                horizontalLineTo(5.4f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5.4f)
                verticalLineToRelative(13.2f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.4f, 22f)
                horizontalLineToRelative(6.2f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.4f, -3.4f)
                verticalLineTo(16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(2.6f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.4f, 1.4f)
                horizontalLineTo(5.4f)
                arcTo(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 18.6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.293f, 8.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, 0f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.414f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, -1.414f)
                lineTo(18.586f, 13f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(11.586f)
                lineToRelative(-1.293f, -1.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.414f)
            }
        }.build()

        return _SiSignOut!!
    }

@Suppress("ObjectPropertyName")
private var _SiSignOut: ImageVector? = null
