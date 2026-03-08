package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiEditDetailedAlt: ImageVector
    get() {
        if (_SiEditDetailedAlt != null) {
            return _SiEditDetailedAlt!!
        }
        _SiEditDetailedAlt = ImageVector.Builder(
            name = "Duotone.SiEditDetailedAlt",
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
                lineToRelative(0.707f, -3.536f)
                lineToRelative(9.192f, -9.192f)
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
                moveTo(19.071f, 7.757f)
                lineTo(8.464f, 18.364f)
                lineToRelative(-3.535f, 0.707f)
                lineToRelative(0.707f, -3.535f)
                lineTo(16.243f, 4.929f)
                moveToRelative(2.828f, 2.828f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.828f, -2.828f)
                moveToRelative(2.828f, 2.828f)
                lineToRelative(-1.414f, 1.415f)
                lineToRelative(-2.829f, -2.829f)
                lineToRelative(1.415f, -1.414f)
            }
        }.build()

        return _SiEditDetailedAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiEditDetailedAlt: ImageVector? = null
