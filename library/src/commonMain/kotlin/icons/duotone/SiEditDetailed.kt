package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiEditDetailed: ImageVector
    get() {
        if (_SiEditDetailed != null) {
            return _SiEditDetailed!!
        }
        _SiEditDetailed = ImageVector.Builder(
            name = "Duotone.SiEditDetailed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveToRelative(4.929f, 19.071f)
                lineToRelative(0.707f, -3.535f)
                lineToRelative(9.192f, -9.193f)
                lineToRelative(2.829f, 2.829f)
                lineToRelative(-9.193f, 9.192f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(14.828f, 6.343f)
                lineToRelative(2.829f, 2.829f)
                moveToRelative(0.566f, -5.091f)
                lineToRelative(1.697f, 1.697f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.13f)
                lineTo(8.464f, 18.365f)
                lineToRelative(-3.535f, 0.707f)
                lineToRelative(0.707f, -3.535f)
                lineTo(17.091f, 4.08f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.132f, 0f)
            }
        }.build()

        return _SiEditDetailed!!
    }

@Suppress("ObjectPropertyName")
private var _SiEditDetailed: ImageVector? = null
