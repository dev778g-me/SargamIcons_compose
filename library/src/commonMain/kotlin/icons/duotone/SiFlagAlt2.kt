package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiFlagAlt2: ImageVector
    get() {
        if (_SiFlagAlt2 != null) {
            return _SiFlagAlt2!!
        }
        _SiFlagAlt2 = ImageVector.Builder(
            name = "Duotone.SiFlagAlt2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(21f, 4f)
                horizontalLineTo(3f)
                lineToRelative(4.613f, 9.802f)
                lineTo(21f, 14f)
                lineToRelative(-5f, -5f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(11f, 21f)
                lineToRelative(-3.387f, -7.198f)
                moveToRelative(0f, 0f)
                lineTo(3f, 4f)
                horizontalLineToRelative(18f)
                lineToRelative(-5f, 5f)
                lineToRelative(5f, 5f)
                close()
            }
        }.build()

        return _SiFlagAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _SiFlagAlt2: ImageVector? = null
