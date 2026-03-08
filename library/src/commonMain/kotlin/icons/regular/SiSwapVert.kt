package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiSwapVert: ImageVector
    get() {
        if (_SiSwapVert != null) {
            return _SiSwapVert!!
        }
        _SiSwapVert = ImageVector.Builder(
            name = "Regular.SiSwapVert",
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
                moveToRelative(11f, 17f)
                lineToRelative(-4f, 4f)
                moveToRelative(0f, 0f)
                lineToRelative(-4f, -4f)
                moveToRelative(4f, 4f)
                verticalLineTo(3f)
                moveToRelative(14f, 4f)
                lineToRelative(-4f, -4f)
                moveToRelative(0f, 0f)
                lineToRelative(-4f, 4f)
                moveToRelative(4f, -4f)
                verticalLineToRelative(18f)
            }
        }.build()

        return _SiSwapVert!!
    }

@Suppress("ObjectPropertyName")
private var _SiSwapVert: ImageVector? = null
