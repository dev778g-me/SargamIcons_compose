package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiEditSimple: ImageVector
    get() {
        if (_SiEditSimple != null) {
            return _SiEditSimple!!
        }
        _SiEditSimple = ImageVector.Builder(
            name = "Duotone.SiEditSimple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(19.92f, 5.777f)
                lineTo(18.222f, 4.08f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.13f, 0f)
                lineTo(5.635f, 15.536f)
                lineTo(4.93f, 19.07f)
                lineToRelative(3.535f, -0.707f)
                lineTo(19.92f, 6.909f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.132f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.92f, 5.777f)
                lineTo(18.222f, 4.08f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.13f, 0f)
                lineTo(5.635f, 15.536f)
                lineTo(4.93f, 19.07f)
                lineToRelative(3.535f, -0.707f)
                lineTo(19.92f, 6.909f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.132f)
                close()
            }
        }.build()

        return _SiEditSimple!!
    }

@Suppress("ObjectPropertyName")
private var _SiEditSimple: ImageVector? = null
