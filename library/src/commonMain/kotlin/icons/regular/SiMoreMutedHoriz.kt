package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiMoreMutedHoriz: ImageVector
    get() {
        if (_SiMoreMutedHoriz != null) {
            return _SiMoreMutedHoriz!!
        }
        _SiMoreMutedHoriz = ImageVector.Builder(
            name = "Regular.SiMoreMutedHoriz",
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
                verticalLineToRelative(1f)
                moveToRelative(-6f, -1f)
                verticalLineToRelative(1f)
                moveToRelative(12f, -1f)
                verticalLineToRelative(1f)
            }
        }.build()

        return _SiMoreMutedHoriz!!
    }

@Suppress("ObjectPropertyName")
private var _SiMoreMutedHoriz: ImageVector? = null
