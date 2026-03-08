package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiQuote: ImageVector
    get() {
        if (_SiQuote != null) {
            return _SiQuote!!
        }
        _SiQuote = ImageVector.Builder(
            name = "Duotone.SiQuote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(10.99f, 9.449f)
                curveToRelative(0.178f, 3.09f, -1.998f, 7.444f, -6.88f, 9.551f)
                lineTo(3f, 17.08f)
                curveToRelative(1.997f, -1.123f, 3.507f, -2.95f, 4.306f, -5.15f)
                curveToRelative(-2.886f, -0.234f, -3.729f, -2.013f, -3.729f, -3.464f)
                curveToRelative(0f, -1.967f, 1.51f, -3.512f, 3.374f, -3.465f)
                curveToRelative(1.775f, -0.047f, 3.817f, 1.311f, 4.039f, 4.448f)
                moveTo(20.99f, 9.449f)
                curveToRelative(0.178f, 3.09f, -1.997f, 7.444f, -6.88f, 9.551f)
                lineTo(13f, 17.08f)
                curveToRelative(1.998f, -1.123f, 3.507f, -2.95f, 4.306f, -5.15f)
                curveToRelative(-2.886f, -0.234f, -3.729f, -2.013f, -3.729f, -3.464f)
                curveToRelative(0f, -1.967f, 1.51f, -3.512f, 3.374f, -3.465f)
                curveToRelative(1.775f, -0.047f, 3.817f, 1.311f, 4.039f, 4.448f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.99f, 9.449f)
                curveToRelative(0.178f, 3.09f, -1.998f, 7.444f, -6.88f, 9.551f)
                lineTo(3f, 17.08f)
                curveToRelative(1.997f, -1.123f, 3.507f, -2.95f, 4.306f, -5.15f)
                curveToRelative(-2.886f, -0.234f, -3.729f, -2.013f, -3.729f, -3.464f)
                curveToRelative(0f, -1.967f, 1.51f, -3.512f, 3.374f, -3.465f)
                curveToRelative(1.775f, -0.047f, 3.817f, 1.311f, 4.039f, 4.448f)
                moveTo(20.99f, 9.449f)
                curveToRelative(0.178f, 3.09f, -1.997f, 7.444f, -6.88f, 9.551f)
                lineTo(13f, 17.08f)
                curveToRelative(1.998f, -1.123f, 3.507f, -2.95f, 4.306f, -5.15f)
                curveToRelative(-2.886f, -0.234f, -3.729f, -2.013f, -3.729f, -3.464f)
                curveToRelative(0f, -1.967f, 1.51f, -3.512f, 3.374f, -3.465f)
                curveToRelative(1.775f, -0.047f, 3.817f, 1.311f, 4.039f, 4.448f)
            }
        }.build()

        return _SiQuote!!
    }

@Suppress("ObjectPropertyName")
private var _SiQuote: ImageVector? = null
