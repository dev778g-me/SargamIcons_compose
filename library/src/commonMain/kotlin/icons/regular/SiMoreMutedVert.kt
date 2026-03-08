package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiMoreMutedVert: ImageVector
    get() {
        if (_SiMoreMutedVert != null) {
            return _SiMoreMutedVert!!
        }
        _SiMoreMutedVert = ImageVector.Builder(
            name = "Regular.SiMoreMutedVert",
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
                moveTo(12f, 12f)
                horizontalLineToRelative(1f)
                moveToRelative(-1f, 6f)
                horizontalLineToRelative(1f)
                moveTo(12f, 6f)
                horizontalLineToRelative(1f)
            }
        }.build()

        return _SiMoreMutedVert!!
    }

@Suppress("ObjectPropertyName")
private var _SiMoreMutedVert: ImageVector? = null
