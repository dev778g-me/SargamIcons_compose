package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiClose: ImageVector
    get() {
        if (_SiClose != null) {
            return _SiClose!!
        }
        _SiClose = ImageVector.Builder(
            name = "Filled.SiClose",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.95f, 8.464f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, -1.414f)
                lineTo(12f, 10.586f)
                lineTo(8.464f, 7.05f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7.05f, 8.464f)
                lineTo(10.586f, 12f)
                lineTo(7.05f, 15.536f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.414f, 1.414f)
                lineTo(12f, 13.414f)
                lineToRelative(3.536f, 3.536f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.414f, -1.414f)
                lineTo(13.414f, 12f)
                close()
            }
        }.build()

        return _SiClose!!
    }

@Suppress("ObjectPropertyName")
private var _SiClose: ImageVector? = null
