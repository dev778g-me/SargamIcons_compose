package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiStreetSign: ImageVector
    get() {
        if (_SiStreetSign != null) {
            return _SiStreetSign!!
        }
        _SiStreetSign = ImageVector.Builder(
            name = "Filled.SiStreetSign",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                lineToRelative(4f, 3f)
                lineToRelative(-4f, 3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-5f)
                horizontalLineTo(6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(5f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                lineTo(2f, 6f)
                lineToRelative(4f, -3f)
                horizontalLineToRelative(5f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
            }
        }.build()

        return _SiStreetSign!!
    }

@Suppress("ObjectPropertyName")
private var _SiStreetSign: ImageVector? = null
