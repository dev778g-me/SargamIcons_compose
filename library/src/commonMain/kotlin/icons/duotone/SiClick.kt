package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiClick: ImageVector
    get() {
        if (_SiClick != null) {
            return _SiClick!!
        }
        _SiClick = ImageVector.Builder(
            name = "Duotone.SiClick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveToRelative(11f, 11f)
                lineToRelative(10f, 4.4f)
                lineToRelative(-4.437f, 1.163f)
                lineTo(15.4f, 21f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                verticalLineToRelative(3f)
                moveToRelative(-6.995f, 6.995f)
                horizontalLineToRelative(-3f)
                moveToRelative(2.926f, -7.063f)
                lineToRelative(2.12f, 2.122f)
                moveToRelative(12.022f, -2.129f)
                lineTo(16.95f, 7.047f)
                moveToRelative(-9.9f, 9.9f)
                lineToRelative(-2.12f, 2.12f)
                moveTo(11f, 11f)
                lineToRelative(10f, 4.4f)
                lineToRelative(-4.437f, 1.163f)
                lineTo(15.4f, 21f)
                close()
            }
        }.build()

        return _SiClick!!
    }

@Suppress("ObjectPropertyName")
private var _SiClick: ImageVector? = null
