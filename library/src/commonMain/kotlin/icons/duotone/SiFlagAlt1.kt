package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiFlagAlt1: ImageVector
    get() {
        if (_SiFlagAlt1 != null) {
            return _SiFlagAlt1!!
        }
        _SiFlagAlt1 = ImageVector.Builder(
            name = "Duotone.SiFlagAlt1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(19.8f, 4f)
                curveToRelative(0.66f, 0f, 1.2f, 0.517f, 1.2f, 1.149f)
                verticalLineToRelative(5.553f)
                curveTo(21f, 11.966f, 19.92f, 13f, 18.6f, 13f)
                horizontalLineTo(4.2f)
                curveToRelative(-0.66f, 0f, -1.2f, -0.517f, -1.2f, -1.149f)
                verticalLineTo(6.298f)
                curveTo(3f, 5.034f, 4.08f, 4f, 5.4f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 11.851f)
                curveTo(3f, 12.483f, 3.54f, 13f, 4.2f, 13f)
                horizontalLineToRelative(14.4f)
                curveToRelative(1.32f, 0f, 2.4f, -1.034f, 2.4f, -2.298f)
                lineTo(21f, 5.15f)
                curveTo(21f, 4.517f, 20.46f, 4f, 19.8f, 4f)
                lineTo(5.4f, 4f)
                curveTo(4.08f, 4f, 3f, 5.034f, 3f, 6.298f)
                close()
                moveTo(3f, 11.851f)
                lineTo(3f, 20f)
            }
        }.build()

        return _SiFlagAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _SiFlagAlt1: ImageVector? = null
