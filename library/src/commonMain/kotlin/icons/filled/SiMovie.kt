package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiMovie: ImageVector
    get() {
        if (_SiMovie != null) {
            return _SiMovie!!
        }
        _SiMovie = ImageVector.Builder(
            name = "Filled.SiMovie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.054f, 3f)
                lineTo(8.387f, 8f)
                horizontalLineToRelative(5.892f)
                lineToRelative(1.667f, -5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.946f, 3f)
                lineTo(6.279f, 8f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(20f)
                verticalLineTo(8f)
                horizontalLineToRelative(-5.613f)
                lineToRelative(1.667f, -5f)
                horizontalLineTo(20.6f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 5.4f)
                verticalLineToRelative(13.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(3.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 18.6f)
                verticalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.4f, 3f)
                close()
            }
        }.build()

        return _SiMovie!!
    }

@Suppress("ObjectPropertyName")
private var _SiMovie: ImageVector? = null
