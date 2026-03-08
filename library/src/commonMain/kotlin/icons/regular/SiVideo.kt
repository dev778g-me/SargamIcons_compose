package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiVideo: ImageVector
    get() {
        if (_SiVideo != null) {
            return _SiVideo!!
        }
        _SiVideo = ImageVector.Builder(
            name = "Regular.SiVideo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.6f, 6f)
                horizontalLineTo(3.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 8.4f)
                verticalLineToRelative(7.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.4f, 18f)
                horizontalLineToRelative(8.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.4f)
                verticalLineTo(8.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.6f, 6f)
                close()
                moveTo(23f, 6f)
                lineToRelative(-6f, 6f)
                lineToRelative(6f, 6f)
                close()
            }
        }.build()

        return _SiVideo!!
    }

@Suppress("ObjectPropertyName")
private var _SiVideo: ImageVector? = null
