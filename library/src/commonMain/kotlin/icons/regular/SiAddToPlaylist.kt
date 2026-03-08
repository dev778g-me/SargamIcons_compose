package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiAddToPlaylist: ImageVector
    get() {
        if (_SiAddToPlaylist != null) {
            return _SiAddToPlaylist!!
        }
        _SiAddToPlaylist = ImageVector.Builder(
            name = "Regular.SiAddToPlaylist",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 11f)
                horizontalLineToRelative(12f)
                moveToRelative(-1f, 4f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
                moveTo(4f, 7f)
                horizontalLineToRelative(12f)
                moveTo(4f, 15f)
                horizontalLineToRelative(8f)
            }
        }.build()

        return _SiAddToPlaylist!!
    }

@Suppress("ObjectPropertyName")
private var _SiAddToPlaylist: ImageVector? = null
