package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiSignInAlt: ImageVector
    get() {
        if (_SiSignInAlt != null) {
            return _SiSignInAlt!!
        }
        _SiSignInAlt = ImageVector.Builder(
            name = "Filled.SiSignInAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.6f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(5f)
                arcTo(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 5.4f)
                verticalLineToRelative(13.2f)
                arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.4f, 1.4f)
                horizontalLineTo(13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(5.6f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.4f, -3.4f)
                verticalLineTo(5.4f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.6f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.293f, 7.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, 0f)
                lineToRelative(4f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.414f)
                lineToRelative(-4f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, -1.414f)
                lineTo(14.586f, 13f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(11.586f)
                lineToRelative(-2.293f, -2.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.414f)
            }
        }.build()

        return _SiSignInAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiSignInAlt: ImageVector? = null
