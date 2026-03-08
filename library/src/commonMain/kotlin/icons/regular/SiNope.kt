package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiNope: ImageVector
    get() {
        if (_SiNope != null) {
            return _SiNope!!
        }
        _SiNope = ImageVector.Builder(
            name = "Regular.SiNope",
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
                moveTo(19.187f, 5.047f)
                lineTo(4.957f, 19.098f)
                moveTo(22f, 12f)
                curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
                reflectiveCurveTo(2f, 6.477f, 2f, 12f)
                reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
            }
        }.build()

        return _SiNope!!
    }

@Suppress("ObjectPropertyName")
private var _SiNope: ImageVector? = null
