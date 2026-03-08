package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiMap: ImageVector
    get() {
        if (_SiMap != null) {
            return _SiMap!!
        }
        _SiMap = ImageVector.Builder(
            name = "Duotone.SiMap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(9f, 19f)
                verticalLineTo(3f)
                lineToRelative(6f, 2f)
                verticalLineToRelative(16f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 3f)
                verticalLineToRelative(16f)
                moveTo(9f, 3f)
                lineTo(2f, 5f)
                verticalLineToRelative(16f)
                lineToRelative(7f, -2f)
                moveTo(9f, 3f)
                lineToRelative(6f, 2f)
                moveTo(9f, 19f)
                lineToRelative(6f, 2f)
                moveToRelative(0f, -16f)
                verticalLineToRelative(16f)
                moveToRelative(0f, -16f)
                lineToRelative(7f, -2f)
                verticalLineToRelative(16f)
                lineToRelative(-7f, 2f)
            }
        }.build()

        return _SiMap!!
    }

@Suppress("ObjectPropertyName")
private var _SiMap: ImageVector? = null
