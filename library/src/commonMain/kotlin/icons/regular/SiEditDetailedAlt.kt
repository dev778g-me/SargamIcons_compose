package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiEditDetailedAlt: ImageVector
    get() {
        if (_SiEditDetailedAlt != null) {
            return _SiEditDetailedAlt!!
        }
        _SiEditDetailedAlt = ImageVector.Builder(
            name = "Regular.SiEditDetailedAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(14.828f, 6.343f)
                lineToRelative(2.829f, 2.829f)
                moveToRelative(1.414f, -1.415f)
                lineTo(8.464f, 18.364f)
                lineToRelative(-3.535f, 0.707f)
                lineToRelative(0.707f, -3.536f)
                lineTo(16.243f, 4.93f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.828f, 2.828f)
                close()
            }
        }.build()

        return _SiEditDetailedAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiEditDetailedAlt: ImageVector? = null
