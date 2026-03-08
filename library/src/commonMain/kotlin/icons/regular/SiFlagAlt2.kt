package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiFlagAlt2: ImageVector
    get() {
        if (_SiFlagAlt2 != null) {
            return _SiFlagAlt2!!
        }
        _SiFlagAlt2 = ImageVector.Builder(
            name = "Regular.SiFlagAlt2",
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
